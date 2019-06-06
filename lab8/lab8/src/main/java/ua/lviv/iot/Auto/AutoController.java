package ua.lviv.iot.Auto;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.Auto.Auto;
import ua.lviv.iot.Auto.Manager.AutoRepository;


@RestController
public class AutoController {

  @Autowired
   AutoRepository autoRepository;

  @RequestMapping(value = "/auto", method = RequestMethod.GET)
  public List<Auto> getEquities() {
    return (List<Auto>) autoRepository.findAll();
  }

  @RequestMapping(value = "/auto/{id}", method = RequestMethod.GET)
  public Auto getEquity(@PathVariable Integer id) {
    return autoRepository.findById(id).get();
  }

  @RequestMapping(value = "/auto", method = RequestMethod.POST)
  public Auto postEquity(@RequestBody Auto equity) {
    return autoRepository.save(equity);
  }

  @RequestMapping(value = "/auto/{id}", method = RequestMethod.PUT)
  public Auto updateEquity(@RequestBody Auto newEquity, @PathVariable Integer id) {
    return autoRepository.findById(id)
            .map(equity -> {
      newEquity.setId(id);
      return autoRepository.save(newEquity);
    }).orElseThrow(null);
  }

  @RequestMapping(value = "/auto/{id}", method = RequestMethod.DELETE)
  public Auto deleteEquity(@PathVariable Integer id) {
    Auto temp = getEquity(id);
    autoRepository.deleteById(id);
    return temp;
  }
}