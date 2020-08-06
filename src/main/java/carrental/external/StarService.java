
package carrental.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="stars", url="http://stars:8080", fallback = StarServiceFallback.class)
//@FeignClient(name="stars", url="http://localhost:8086", fallback = StarServiceFallback.class)
public interface StarService {

    @RequestMapping(method= RequestMethod.POST, path="/stars")
    public void star(@RequestBody Star star);

    @RequestMapping(method= RequestMethod.POST, path="/stars")
    public void starCanceled(@RequestBody Star star);
}