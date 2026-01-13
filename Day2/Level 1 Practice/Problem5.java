public class Problem5 {
    public static void main(String[] args){
        int pen = 14;
        int student = 3;
        int remainder = pen%student;
        int pensPerStudent = (pen-remainder)/student;
        System.out.println( "Each student will get "+pensPerStudent+" pens "+"and remaining pen will be "+ remainder);
    }
}        