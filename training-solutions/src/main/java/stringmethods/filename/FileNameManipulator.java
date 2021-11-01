package stringmethods.filename;

public class FileNameManipulator {

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        System.out.println(fileNameManipulator.findLastCharacter("Dóri a Kakaó ivó "));
        System.out.println(fileNameManipulator.findLastCharacter("Dóri a Kakaó ivó   \n "));
        System.out.println(fileNameManipulator.findFileExtension("Riport.pdf"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("xls", "Táblázat.xls"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("doc", "Táblázat.docx"));
        System.out.println(fileNameManipulator.compareFilesByName("FileNameManipulator.java", "FILENAMEMANiPULATOR.JAVA"));
        System.out.println(fileNameManipulator.compareFilesByName("FileNameManipulator.java", "FileNameManipulator.class"));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("FileNameManipulator.Java"));
        System.out.println(fileNameManipulator.replaceStringPart("FileNameManipulator.class", "class", "java"));

    }

    public char findLastCharacter(String str) {
        return str.trim().charAt(str.trim().length() - 1);
    }

    public String findFileExtension(String fileName) {
        int i = fileName.trim().lastIndexOf('.');
        return fileName.trim().substring(i+1);
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        return fileName.trim().endsWith("."+ext.trim());
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.trim().equalsIgnoreCase(actualFileName.trim());
    }

    public String changeExtensionToLowerCase(String fileName) {
        fileName = fileName.trim();
        int i = fileName.lastIndexOf('.');
        return fileName.substring(0, i) + fileName.substring(i).toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.contains(present)?fileName.replace(present, target):fileName;
    }

}
