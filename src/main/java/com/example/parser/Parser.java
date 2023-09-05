package com.example.parser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Parser {
    public static List<String> parse() throws IOException {
        //connecting to a wiki page
        Document document = Jsoup.connect("https://en.m.wikipedia.org/wiki/List_of_cities_in_Ukraine").get();
        //getting all names of cities
        String table = document.select("table.wikitable.sortable tr td:eq(0) a:eq(0)").text();
        //cleaning links like -> [a]
        String [] words = table.replaceAll( "^\\[", "").split(" ");
        //casting words into list
        return Arrays.asList(words);
    }
}
