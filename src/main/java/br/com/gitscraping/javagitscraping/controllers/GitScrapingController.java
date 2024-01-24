package br.com.gitscraping.javagitscraping.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gitscraping.javagitscraping.classes.GitInfo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;


/**
 * GitScrapingController
 */
@RestController
public class GitScrapingController {
    @GetMapping("/git-info")
	public ResponseEntity<List<GitInfo>> get(String rep) {
		try {
			String git = "https://github.com/";
			Document document = Jsoup.connect(git + rep).get();
			Elements initiaElements = document.getElementsByClass("BorderGrid about-margin");
			Element initialElement = initiaElements.getFirst();
			Element ulElement = initialElement.getElementsByTag("ul").getFirst();
			Elements spansElements = ulElement.getElementsByTag("span");

			List<GitInfo> gitInfos = new ArrayList<>();

			for(int i = 0; i < spansElements.size() - 1; i+=2){

				GitInfo gitInfo = new GitInfo(spansElements.get(i).html(), spansElements.get(i+1).html());
				gitInfos.add(gitInfo);
			}

			
			return ResponseEntity.ok(gitInfos);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}