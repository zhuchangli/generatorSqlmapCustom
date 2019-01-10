import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorSqlmap {
  /**
   *@ClassName GeneratorSqlmap
   *@Description TODO
   *@author zizl_zq
   *@Date 1/8/19 12:12 PM
   */

    public void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overtwrite = true;
        // 指定逆向工程配置文件
        File configfile = new File("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configfile);
        DefaultShellCallback callback = new DefaultShellCallback(overtwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
    public static void main(String [] args){
        try {
            GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
            generatorSqlmap.generator();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
