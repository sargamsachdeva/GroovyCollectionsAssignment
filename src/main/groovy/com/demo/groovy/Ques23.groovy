package com.demo.groovy

class Ques23 {
    static void main(String[] args) {

        println getQueryParams("http://www.google.com?name=johny&age=20&hobby=cricket").get("name");
    }

     static Map<String, List<String>> getQueryParams(String url) {

        try {

            Map<String, List<String>> params = new HashMap<String, List<String>>();
            String[] urlParts = url.split("\\?");

            if (urlParts.length > 1) {
                String query = urlParts[1];

                for (String param : query.split("&")) {
                    String[] pair = param.split("=");
                    String key = URLDecoder.decode(pair[0], "UTF-8");
                    String value = "";

                    if (pair.length > 1) {
                        value = URLDecoder.decode(pair[1], "UTF-8");
                    }

                    List<String> values = params.get(key);
                    if (values == null) {
                        values = new ArrayList<String>();
                        params.put(key, values);
                    }

                    values.add(value);
                }
            }

            return params;
        } catch (UnsupportedEncodingException ex) {
            throw new AssertionError(ex);
        }
    }
}