package com.metro.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;

@Controller
public class MetroController {
    private static final String[] STATIONS = {
        // Green Line (with northern extension)
        // Green Line (including northern extension)
        "Madavara", "Manjunath Nagar", "Chikkabidarakallu", "Nagasandra", "Dasarahalli", "Jalahalli", "Peenya Industry", "Peenya", "Goraguntepalya", "Yeshwanthpur", "Sandal Soap Factory", "Mahalakshmi", "Rajajinagar", "Kuvempu Road", "Srirampura", "Mantri Square Sampige Road", "Majestic", "Chickpet", "Krishna Rajendra Market", "National College", "Lalbagh", "South End Circle", "Jayanagar", "Rashtreeya Vidyalaya Road", "Banashankari", "Jaya Prakash Nagar", "Yelachenahalli", "Konanakunte Cross", "Doddakallasandra", "Vajarahalli", "Thalaghattapura", "Silk Institute",
        // Purple Line (with additional stations and renames)
        // Purple Line (including additional stations)
        "Challaghatta", "Kengeri", "Kengeri Bus Terminal", "Pattangere", "Rajarajeshwari Nagar", "Pantharapalya – Nayandahalli", "Jnanabharathi", "Nayandahalli", "Mysore Road", "Deepanjali Nagar", "Attiguppe", "Vijayanagar", "Balagangadharanatha Swamiji Station", "Magadi Road", "City Railway Station", "Sir M. Visvesvaraya Station", "Vidhana Soudha", "Cubbon Park", "M.G. Road", "Trinity", "Halasuru", "Indiranagar", "Swami Vivekananda Road", "Baiyappanahalli", "Benniganahalli", "K.R. Pura", "Singayyanapalya", "Mahadevapura", "Garudacharpalya", "Hoodi", "Seetharamapalya", "Kundalahalli", "Nallurhalli", "Sri Sathya Sai Hospital", "Pattandur Agrahara", "Kadugodi Tree Park", "Hopefarm Channasandra", "Whitefield (Kadugodi)"
    };

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("stations", STATIONS);
        return "index";
    }

    @PostMapping("/route")
    public String getRoute(@RequestParam("source") int sourceIdx,
                          @RequestParam("dest") int destIdx,
                          Model model) {
        // TODO: Integrate with MetroMap/MetroFeatures for real logic
        String source = STATIONS[sourceIdx];
        String dest = STATIONS[destIdx];
        // Dummy values for now
        List<String> path = Arrays.asList(source, dest);
        int distance = Math.abs(destIdx - sourceIdx);
        int fare = 10 + distance * 2;
        int travelTime = distance * 2;
        double km = distance * 1.2;
        int kmInt = (int) km;
        int meters = (int) Math.round((km - kmInt) * 1000);
        model.addAttribute("stations", STATIONS);
        model.addAttribute("source", source);
        model.addAttribute("dest", dest);
        model.addAttribute("path", path);
        model.addAttribute("distance", distance);
        model.addAttribute("fare", fare);
        model.addAttribute("travelTime", travelTime);
        model.addAttribute("kmInt", kmInt);
        model.addAttribute("meters", meters);
        return "index";
    }
}
