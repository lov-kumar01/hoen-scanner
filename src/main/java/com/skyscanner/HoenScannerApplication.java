package com.skyscanner;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import java.util.List;

public class HoenScannerApplication extends Application<HoenScannerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HoenScannerApplication().run(args);
    }

    @Override
    public String getName() {
        return "hoen-scanner";
    }

    @Override
    public void initialize(final Bootstrap<HoenScannerConfiguration> bootstrap) {

    }

    @Override
    public void run(HoenScannerConfiguration configuration, Environment environment) {
        // Load JSON files into a single list of search results
        List<SearchResult> searchResults = loadSearchResults();

        // Register the SearchResource
        environment.jersey().register(new SearchResource(searchResults));
    }

    private List<SearchResult> loadSearchResults() {
        // Implement logic to load and combine rental_cars.json and hotels.json
        // Return a combined list of SearchResult objects
        return null; // Placeholder return statement
    }

}
