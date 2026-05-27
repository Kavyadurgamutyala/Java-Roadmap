JAVA BASICS — INTERVIEW CHEAT SHEET
═══════════════════════════════════════════

JVM vs JDK vs JRE:
  JDK  → install this (compiler + JRE + tools)
  JRE  → only runs Java
  JVM  → runs bytecode, platform independent

DATA TYPES:
  int      → whole numbers       (-2B to 2B)
  long     → big whole numbers   (add L)
  double   → decimal numbers     (most precise)
  float    → decimal numbers     (add f)
  String   → text                ("hello")
  char     → single character    ('A')
  boolean  → true/false

COMMON INTERVIEW QUESTIONS:
  Q: What is JVM?
  A: Runs Java bytecode, makes Java platform independent

  Q: Why is Java platform independent?
  A: Code compiles to bytecode, JVM runs it on any OS

  Q: What is the default value of int?
  A: 0

  Q: What is the default value of boolean?
  A: false

  Q: What is the default value of String?
  A: null

TWO SUM (LC #1):
  Brute Force → O(n²) two loops
  HashMap     → O(n)  one loop ✅
  Key idea:
    complement = target - current
    store {number: index} in map
    check if complement seen before

GIT COMMANDS:
  git init          → start tracking
  git add .         → stage all files
  git commit -m ""  → save snapshot
  git remote add    → connect to GitHub
  git push          → upload to GitHub