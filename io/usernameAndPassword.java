package io;

import java.io.*;

public class usernameAndPassword {
    public static void main(String[] args) {
        Account a1=new Account();
        try {
            a1.setUsername();
            a1.setPassword();
            a1.saveTxt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            a1.logIn();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

class Account{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername() throws Exception {
        System.out.println("请设置用户名：");
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String s ="";
        while((s=br.readLine())!=null){
            if (s.equals("end")){
                break;
            }
            this.username=s;
        }
        //br.close();
    }

    public void setPassword() throws Exception {
        System.out.println("请设置密码：");
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String s ="";
        while((s=br.readLine())!=null){
            if (s.equals("end")){
                break;
            }
            this.password=s;
        }
        //br.close();
    }
    public void saveTxt() throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("io/account.txt"));
        bw.write(this.username+"/");
        bw.write(this.password);
        bw.flush();
        //bw.close();
    }
    public static void logIn() throws Exception {
        BufferedInputStream fr = new BufferedInputStream(new FileInputStream("io/account.txt"));
        byte[] b = new byte[100];
        int len=0;
        String up=null;
        while((len=fr.read(b))!=-1){
            //System.out.println("读取账号和密码："+new String(b,0,len));
            up= new String(b,0,len);
        }
        fr.close();

        //字节转字符输入流
        InputStreamReader is = new InputStreamReader(System.in);
        //把字符流放入字符缓冲器
        BufferedReader br = new BufferedReader(is);
        String s ="";
        System.out.println("请输入账号以及密码,/为分隔符");
        while((s=br.readLine())!=null){
            if (s.equals("end")){
                break;
            }else if (s.equals(up)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("登录失败，请重新输入。键入end退出");

            }

        }
    }



}

