# gitdemo01
This demo for today
>>>>>>> 6daedef53daac29d7fca99ede08457fccb3aae73
# GitDemo - Branching and Merging Demonstration

A comprehensive Git demonstration project showcasing branch creation, development, and manual merging with multilingual support.

## Features

- **Multi-branch Development:** Demonstrates parallel development across multiple branches
- **Manual Merging:** Shows proper merge strategies and conflict resolution
- **Multilingual Support:** Includes Mongolian greetings with proper Unicode handling
- **ASCII Art Rendering:** Custom utility class for text decoration and formatting
- **Maven Integration:** Professional Java project structure with Maven build system

## Project Structure

```
gitdemo01/
├── src/main/java/org/example/
│   ├── Main.java           # Main application with greeting methods
│   └── ASCIIRenderer.java  # ASCII art utility class
├── pom.xml                 # Maven configuration
└── GitDemo_Solution_Document.md  # Complete project documentation
```

## Program Output

```
Hello World!
Good morning Universe

┌─────────────────┐
│ Сайн уу дэлхий! │
└─────────────────┘
*** Танд сайхан өдөр хүсье! ***

***********
* Мэндвт! *
***********
```

## How to Run

```bash
# Clone the repository
git clone https://github.com/Dxminick-alt/gitdemo01.git
cd gitdemo01

# Compile and run with Maven
mvn compile exec:java -Dexec.mainClass="org.example.Main"
```

## Branch Development History

- **main:** Initial setup and merged changes
- **branchA:** Modified greeting method to "Good morning"
- **branchB:** Modified name method to "Universe" 
- **branchC:** Added Mongolian greetings with ASCIIRenderer support

## Git History Visualization

```
*   b4ddc5d (HEAD -> main) Merge branchC: Added Mongolian greetings with ASCIIRenderer
|\  
| * ce95504 (branchC) BranchC: Added Mongolian greetings with ASCIIRenderer support
* |   9ac2629 Merge branchB: Added 'Universe' name
|\ \  
| * | 2975966 (branchB) BranchB: Modified getName() method to return 'Universe'
| |/  
* |   fafe978 Merge branchA: Added 'Good morning' greeting
|\ \  
| |/  
|/|   
| * 02ce33c (branchA) BranchA: Modified getGreeting() method to return 'Good morning'
|/  
* ca8794a Initial commit: Hello World program with two methods
```

## Git Rollback Reference

This project includes comprehensive documentation for Git rollback procedures suitable for solo development. See `GitDemo_Solution_Document.md` for detailed rollback strategies.

## Technologies Used

- **Java 24**
- **Maven 3.x**
- **Git Version Control**
- **Unicode/UTF-8 Encoding**
- **IntelliJ IDEA**

## Learning Objectives

This project demonstrates:
- ✅ Git branch creation and management
- ✅ Independent parallel development
- ✅ Manual merge strategies
- ✅ Unicode character handling
- ✅ Object-oriented programming principles
- ✅ Maven project structure
- ✅ Professional documentation practices

## Documentation

For complete project details, implementation notes, and Git rollback procedures, see:
- [GitDemo_Solution_Document.md](GitDemo_Solution_Document.md)

---
*Created as part of Git workflow demonstration and best practices learning.*
=======
# gitdemo01
This demo for today
>>>>>>> 6daedef53daac29d7fca99ede08457fccb3aae73
