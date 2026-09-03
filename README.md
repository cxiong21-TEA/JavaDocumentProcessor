# Java Document Processor

A Java application that processes text from a file or string and analyzes the contents using multiple data structures.

## Overview

This project was developed for a Data Structures and Java course.

The program loads text from either a file or a string, separates the text into individual words, and stores the results using different abstract data types. It tracks all words, unique words, and misspelled words while also providing basic document statistics. :contentReference[oaicite:0]{index=0}

## Features

- Loads text from a file
- Loads and processes text from a string
- Stores all document words in a list
- Tracks unique words using a set
- Tracks misspelled words using a bag
- Counts total words
- Counts unique words
- Calculates syllable totals
- Counts polysyllabic words
- Includes JUnit tests for core functionality :contentReference[oaicite:1]{index=1} :contentReference[oaicite:2]{index=2} :contentReference[oaicite:3]{index=3}

## Technologies Used

- Java
- Visual Studio Code
- JUnit
- File I/O
- Lists
- Sets
- Bags
- Object-Oriented Programming

## How It Works

The program reads text and separates it into tokens using punctuation and whitespace as delimiters. Words are converted to lowercase, and words shorter than three characters are ignored. :contentReference[oaicite:4]{index=4} :contentReference[oaicite:5]{index=5}

The program then uses different data structures to organize the document:

- A **List** stores all processed words.
- A **Set** stores unique words.
- A **Bag** stores misspelled words.
- A second **Set** is used as the dictionary of valid words. :contentReference[oaicite:6]{index=6}

## Testing

JUnit tests are included to verify functionality such as:

- Adding individual words
- Counting unique words
- Loading text from a string
- Loading text from a file
- Calling document-statistics methods :contentReference[oaicite:7]{index=7} :contentReference[oaicite:8]{index=8}

## What I Learned

This project strengthened my understanding of Java data structures and how different abstract data types can be used for different purposes. I also gained experience with file handling, string processing, object-oriented programming, and unit testing.

## Project Files

- `Project2.java` — Main document-processing implementation
- `Project2Test.java` — JUnit tests for the project

## Course Dependencies

This project uses course-provided classes and interfaces from the `itsc2214` package, including data structure interfaces and the `Document` class. Those dependencies may not be included in this repository. :contentReference[oaicite:9]{index=9}
