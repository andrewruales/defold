package com.dynamo.cr.web2.client.place;

import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class GuidePlace extends DefoldPlace {

    private String id;

    public GuidePlace(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return niceify(id);
    }

    @Prefix("!guide")
    public static class Tokenizer implements PlaceTokenizer<GuidePlace> {
        @Override
        public String getToken(GuidePlace place) {
            return place.getId();
        }

        @Override
        public GuidePlace getPlace(String token) {
            return new GuidePlace(token);
        }
    }
}
