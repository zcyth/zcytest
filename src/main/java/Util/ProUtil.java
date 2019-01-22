package Util;

import java.io.*;
import java.util.Properties;

public class ProUtil {
    static private String filePath;

    static private ProUtil proUtil;

    private ProUtil(){}
//    private ProUtil(String filePath){
//        this.filePath = filePath;
//    }

    //public static ProUtil getInstance(String filePath){

    /**
     * 单独操作配置文件，只能有一个人打开配置config.properties
     * @return
     */
    public static ProUtil getInstance(){
        if (proUtil == null){
            synchronized (ProUtil.class){
                proUtil = new ProUtil();
            }
        }
        return proUtil;
    }

    /**
     * 读取配置文件内容
     * @param filePath
     * @return
     */
    public Properties readProperties(String filePath){
        Properties properties = new Properties();
        try{
            InputStream inputStream = new FileInputStream(filePath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            properties.load(bufferedInputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * 获取配置文件key值
     * @param key
     * @return
     */
    public String getPro(Properties properties, String key){
        if(properties.containsKey(key)){
            String username = properties.getProperty(key);
            return username;
        }else {
            System.out.println("你获取的值不在");
            return "";
        }
    }

    /**
     * 写配置文件
     * @param key
     * @param value
     */
    public void writePro(String key, String value){
        Properties pr = new Properties();
        try{
            FileOutputStream file = new FileOutputStream(filePath);
            pr.setProperty(key,value);
            pr.store(file,key);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
// 测试配置文件是否有效
//    public static void main(String[] args) {
//     // String name =  ProUtil.getInstance(ProUtil.class.getResource("/config/config.properties").getPath().readProperties().getProperty("name");
//      // String name = ProUtil.getInstance(ProUtil.class.getResource("/config/config.properties").getPath()).readProperties().getProperty("name");
//        String name = ProUtil.getInstance().readProperties(ProUtil.class.getResource("/config/config.properties").getPath()).getProperty("name");
//        System.out.println(name);
//    }
}
