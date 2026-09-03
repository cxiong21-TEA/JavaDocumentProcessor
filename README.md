# Java Document Processor

A Java application that processes text from a file or string and analyzes the contents using multiple data structures.

## Overview

This project was developed for a Data Structures and Java course.

The program loads text from either a file or a string, separates the text into individual words, and stores the results using different abstract data types. It tracks all words, unique words, and misspelled words while also providing document statistics. :contentReference[oaicite:0]{index=0}

## Features

- Loads text from a file or string
- Stores all processed words in a list
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

Different data structures are used for different parts of the document:

- A **List** stores all processed words
- A **Set** stores unique words
- A **Bag** stores misspelled words
- A second **Set** represents the dictionary of valid words :contentReference[oaicite:6]{index=6}

## Testing

JUnit tests are included to verify functionality such as:

- Adding individual words
- Counting unique words
- Loading text from a string
- Loading text from a file
- Calling document statistics methods :contentReference[oaicite:7]{index=7} :contentReference[oaicite:8]{index=8}

## Sample Files

The repository includes text files used to test and demonstrate the document processor.

- `shortdoc.txt` — Small test document used by the JUnit file-loading test
- `paragraph.txt` — Sample paragraph containing intentionally misspelled words for testing document and spelling analysis
- `kennedy.txt` — Larger sample document used for testing text processing with a longer input
- `dictionary.txt` — Word list used to support dictionary and spelling-related functionality

The paragraph sample intentionally includes misspellings such as `compleatly`, `recipies`, and `embarassing`, making it useful for testing spelling-related behavior. :contentReference[oaicite:9]{index=9}

## Project Files

```text
Java-Document-Processor/
├── README.md
├── Project2.java
├── Project2Test.java
├── shortdoc.txt
├── paragraph.txt
├── kennedy.txt
└── dictionary.txt
