package com.ashitsathish.moviecatologservice.Controller;

import com.ashitsathish.moviecatologservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatlogResource {

    /**
     * Returns a single movie that matches the userId.
     * @param userId
     * @return List.
     */
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
            return Collections.singletonList(
                    new CatalogItem("Transformers","Test",4)
            );
    }
}
