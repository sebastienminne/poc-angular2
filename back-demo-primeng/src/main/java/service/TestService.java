package service;

import bo.TestTable;
import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import repo.TestRepo;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestService {


  @Autowired
  private TestRepo testRepo;

  @RequestMapping(method=RequestMethod.GET)
  public @ResponseBody List<TestTable> test(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
    return Lists.newArrayList(testRepo.findAll());
  }

}
