package ForMultiFileProgramfolder;



public class ProtectionInClasses {
    public String s1="Hello";
    private String s2="Thankyou";
    protected String s3="Bye";

    public void readString(){
        System.out.println("public String is:"+s1);
        System.out.println("private String is:"+s2);
        System.out.println("protected String is:"+s3);



    }
}