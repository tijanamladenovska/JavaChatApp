# Java Chat Application

This repository features a fully functional **real-time chat application** built using Java. It leverages Java's powerful **networking** capabilities alongside the **Swing GUI toolkit** to deliver a dynamic, user-friendly messaging experience between clients on a local network.

## Features

- 🧑‍💻 Real-time message broadcasting between multiple clients  
- ⏰ Timestamps and usernames on every message  
- 🚪 Graceful client exits with system message alerts  
- 🪟 Simple, responsive Swing-based UI  
- 🧠 Modular, readable Java codebase with room for customization

## 📁 Project Structure

```plaintext
.
├── ChatServer.java          # Handles incoming connections and broadcasts messages
├── ChatClient.java          # Connects to the server, handles message sending/receiving
├── ChatClientGUI.java       # GUI frontend for the chat client using Swing
└── README.md
