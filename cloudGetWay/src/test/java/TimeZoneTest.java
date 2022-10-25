import com.atguigu.Mapper.HrUserMapper;
import com.atguigu.server.imp.HrUserServerImp;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;

import java.time.ZonedDateTime;

@SpringBootConfiguration
public class TimeZoneTest {
    @Autowired
    HrUserServerImp hrUserMapper;
    @Test
    public  void TimeTest(){
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        System.out.println(hrUserMapper.getByName("张三"));
    }

}
