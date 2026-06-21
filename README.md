# ATM System in Java (CLI-Based Banking Application)

<ul>
  <li>A menu-driven console-based ATM simulation system built using Core Java (loops, functions, and conditional logic).</li>
  <li>This project simulates real-world banking workflows such as account creation, login authentication, deposits, withdrawals, and account management — all through a structured CLI interface.</li>
</ul>

# Project Overview
This system mimics a simplified ATM experience where users can:

<ol>
  <li>Create a bank account.</li>
  <li>Login using credentials.</li>
  <li>Access banking operations after authentication.</li>
  <li>Perform transactions like deposit and withdrawal.</li>
  <li>View account details and balance.</li>
  <li>Securely logout from the session.</li>
</ol>

The project is built using procedural programming in Java, focusing on control flow, validation, and modular function design.

# Core Functional Flow

<h3>1. Main Menu (Entry Point)</h3>

<h4>When the program starts, the user is presented with:</h4>

  1. Create Account.
  2. Login.
  3. Exit.

<h3>2. Authentication Flow</h3>
<ul>
 <li>Users must first create an account.</li>
 <li>Login requires valid credentials.</li>
 <li>Only authenticated users can access banking operations.</li> 
</ul>

<h3>3. Banking Menu (After Login)</h3>

<h4>Once logged in successfully, the system enters the banking dashboard:</h4>

  1. Check Balance
  2. Deposit Money
  3. Withdraw Money
  4. Account Details
  5. Logout

<h3>Features</h3>
<ul>
  <li>Account Management.</li>
  <li>Create new bank account.</li>
  <li>Store basic user details (name, account info, credentials).</li>
  <li>View account details after login.</li>
</ul>

<h3>Login System</h3>
<ul>
  <li>Username/password or credential-based login.</li>
  <li>Validation before granting access.</li>
  <li>Session-based access control using loops.</li>
</ul>

<h2>💰 Banking Operations</h2>

<p>Once the user successfully logs in, they gain access to the banking dashboard where multiple financial operations can be performed.</p>

<h3>Available Operations</h3>

<ol>
  <li><strong>Check Balance</strong> – Displays the current account balance.</li>
  <li><strong>Deposit Money</strong> – Allows the user to add money to their account.</li>
  <li><strong>Withdraw Money</strong> – Enables cash withdrawal with balance validation.</li>
  <li><strong>Account Details</strong> – Shows user account information.</li>
  <li><strong>Logout</strong> – Ends the current session and returns to the main menu.</li>
</ol>

<hr>

<h2>🧠 Concepts Used</h2>

<ul>
  <li>Java Methods / Functions</li>
  <li>Loops (while, do-while)</li>
  <li>Conditional Statements (if-else, switch-case)</li>
  <li>Input Validation Techniques</li>
  <li>Menu-Driven Program Design</li>
  <li>State Management using Variables</li>
</ul>

<hr>

<h2>🧱 Tech Stack</h2>

<table>
  <tr>
    <th>Component</th>
    <th>Technology</th>
  </tr>
  <tr>
    <td>Language</td>
    <td>Java</td>
  </tr>
  <tr>
    <td>Paradigm</td>
    <td>Procedural Programming</td>
  </tr>
  <tr>
    <td>Interface</td>
    <td>Command Line Interface (CLI)</td>
  </tr>
  <tr>
    <td>Storage</td>
    <td>In-memory variables (no database)</td>
  </tr>
</table>

<hr>

<h2>📁 Project Structure</h2>

<pre>
ATM-System-in-Java/
│
├── atm_banking_system.java   → Main file containing all logic
└── README.md
</pre>

<hr>

<h2>🔁 Program Flow</h2>

<h3>System Flow Diagram</h3>

<pre>
START
  │
  ├── Create Account
  ├── Login Validation
  │
  └── If Login Success
        │
        ▼
   BANKING MENU LOOP
        │
        ├── Check Balance
        ├── Deposit Money
        ├── Withdraw Money
        ├── Account Details
        ├── Logout → Return to Main Menu
        │
        ▼
      EXIT
</pre>

<hr>

<h2>▶️ How to Run</h2>

<h3>Requirements</h3>

<ul>
  <li>Java JDK 8 or above</li>
</ul>

<h3>Steps to Execute</h3>

<pre>
# Compile the program
javac atm_banking_system.java

# Run the program
java atm_banking_system
</pre>

<hr>

<h2>🧠 Key Logic Breakdown</h2>

<ul>
  <li><strong>Account Creation:</strong> Stores user details and initializes balance</li>
  <li><strong>Login System:</strong> Validates credentials before granting access</li>
  <li><strong>Deposit:</strong> Adds amount to existing balance</li>
  <li><strong>Withdraw:</strong> Checks balance before deduction</li>
  <li><strong>Logout:</strong> Ends session and returns to main menu</li>
</ul>

<hr>

<h2>📌 Learning Outcomes</h2>

<p>This project helps strengthen core programming fundamentals such as:</p>

<ul>
  <li>Building real-world CLI applications in Java</li>
  <li>Understanding control flow in menu-driven systems</li>
  <li>Handling user input and validation</li>
  <li>Simulating banking logic using basic programming constructs</li>
  <li>Developing problem-solving skills with loops and conditions</li>
</ul>

<hr>

<h2>🚀 Future Enhancements</h2>

<ul>
  <li>File-based data persistence</li>
  <li>Transaction history tracking</li>
  <li>Multi-user account system</li>
  <li>Password encryption</li>
  <li>Database integration using MySQL + JDBC</li>
  <li>GUI version using Java Swing / JavaFX</li>
</ul>

<hr>

<h2>👨‍💻 Author</h2>

<p>
<strong>Suman Das</strong><br>
Java Developer | Web Development Enthusiast
</p>

<p>
🔗 GitHub: <a href="https://github.com/suman-das07">suman-das07</a>
</p>

<hr>

<h2>⭐ Project Value</h2>

<ul>
  <li>Demonstrates strong logical thinking and problem-solving ability</li>
  <li>Simulates real-world banking system workflows</li>
  <li>Shows ability to design structured CLI applications</li>
  <li>Serves as a strong foundational backend-style project</li>
</ul>


