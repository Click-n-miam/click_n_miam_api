package fr.ndroc.click_n_miam_api.controllers;

import fr.ndroc.click_n_miam_api.entities.Option;
import fr.ndroc.click_n_miam_api.entities.Order;
import fr.ndroc.click_n_miam_api.interfaces.OptionRepository;
import fr.ndroc.click_n_miam_api.interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/options")
public class OptionController {

    @Autowired
    private OptionRepository optionRepository;


    @GetMapping
    public List<Option> getOptions() {
        return (List<Option>) optionRepository.findAll();
    }

}
