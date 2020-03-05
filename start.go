package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"

)

type Article struct {
	Title string `json:"Titlt"`
	Desc string `json:"desc"`
	Content string `json:"content"`
}

type Articles []Article

func allArticles(w http.ResponseWriter, r *http.Request){
articles := Articles{
	Article{Title: "Test Title", Desc: "Test Description", Content: "Test Content"},
}

	fmt.Println(w, "Homepage Endpoint Hit")
	json.NewEncoder(w).Encode(articles)
}



func homePage(w http.ResponseWriter, r *http.Request){
	fmt.Fprintf(w, "Homepage Endpoint Hit")
}

func handlRequests(){
	http.HandleFunc("/", homePage)
	http.HandleFunc("/articles", allArticles)
	log.Fatal(http.ListenAndServe(":8081", nil))
}

func main(){
	handlRequests()
}