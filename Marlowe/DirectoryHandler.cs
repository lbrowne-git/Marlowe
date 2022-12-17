using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Net.WebRequestMethods;

namespace Marlowe
{
    public static class DirectoryHandler
    {
        private static List<string> fileInformation = new List<string>();
        public static List<string> GatherFileInformation(string path, bool checkSubDirectories)
        {
            if(checkSubDirectories)
            {
                GatherInformationAboutSubDirectories(path);
            }

            return fileInformation;
        }

        private static void GatherInformationAboutSubDirectories(string path)
        {
            if (Directory.GetDirectories(path).Length > 0)
            {
                foreach (string directory in Directory.GetDirectories(path))
                {
                    GatherInformationAboutSubDirectories(directory);
                }
            }
            GatherInformationAboutFilesInFolder(path);
            
        }

        private static void GatherInformationAboutFilesInFolder(string path)
        {

            foreach (string file in Directory.GetFiles(path, "*.cs"))
            {
                if (System.IO.File.Exists(file))
                {
                    fileInformation.Add(file);
                }
            }
        }
    }
}
