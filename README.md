# LetsConnect

A social networking platform inspired by Facebook that enables users to connect with others, build their network, and interact through a secure and scalable backend architecture.

Built using Java and Spring Boot, the project demonstrates backend engineering concepts such as RESTful API development, authentication, database modeling, service-layer architecture, and scalable application design.

---

## Overview

LetsConnect is a backend-driven social networking application designed to simulate core functionalities found in modern social media platforms.

The application allows users to create accounts, discover other users, send and manage friend requests, and build meaningful connections through a simple and intuitive system.

This project was developed to gain hands-on experience with enterprise-grade backend development while applying software engineering best practices and design principles.

---

## Key Features

### User Management

* User registration and login
* Secure authentication and authorization
* User profile management
* Account validation and security controls

### Social Networking

* Search and discover users
* Send friend requests
* Accept or reject friend requests
* View friend lists
* Manage social connections

### REST API Architecture

* Well-structured RESTful endpoints
* Layered architecture
* DTO-based request and response handling
* Proper exception handling

### Data Persistence

* Relational database integration
* Entity relationship mapping using JPA/Hibernate
* Optimized database operations

---

## System Design Highlights

The project follows a clean layered architecture:

```text
Client
   │
REST Controllers
   │
Service Layer
   │
Repository Layer
   │
Database
```

### Architectural Principles

* Separation of Concerns (SoC)
* Dependency Injection
* SOLID Principles
* Repository Pattern
* DTO Pattern
* Exception Handling Strategy

---

## Technology Stack

### Backend

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate

### Database

* MySQL / H2 Database

### Build Tool

* Maven

### Testing

* JUnit
* Mockito

### Version Control

* Git
* GitHub

---

## Core Domain Model

### User

Represents a registered platform user.

Responsibilities:

* Profile management
* Authentication
* Connection management

### Friend Request

Represents a pending connection between two users.

States:

* Pending
* Accepted
* Rejected

### Friendship

Represents a successful connection between two users after acceptance of a friend request.

---

## API Capabilities

### User APIs

```http
POST   /users/register
POST   /users/login
GET    /users/{id}
PUT    /users/{id}
```

### Friend Request APIs

```http
POST   /friends/request
PUT    /friends/accept/{requestId}
PUT    /friends/reject/{requestId}
GET    /friends/pending
```

### Friendship APIs

```http
GET    /friends/list
DELETE /friends/remove/{friendId}
```

*Endpoint names may vary depending on implementation.*

---

## Database Design

The system models relationships between users through dedicated entities and relational mappings.

Example:

```text
User
 ├── Sent Friend Requests
 ├── Received Friend Requests
 └── Friends
```

This structure ensures data consistency while supporting efficient querying and scalability.

---

## Security Considerations

Implemented backend security practices include:

* Password encryption
* Input validation
* Authentication controls
* Exception handling
* Prevention of unauthorized resource access

---

## Learning Outcomes

This project demonstrates practical experience in:

* Backend System Design
* REST API Development
* Spring Boot Ecosystem
* Database Design
* Object-Oriented Programming
* Authentication & Authorization
* JPA/Hibernate ORM
* Software Design Patterns
* Clean Code Practices

---

## Future Enhancements

Planned improvements include:

* News Feed System
* User Posts
* Likes and Comments
* Real-Time Notifications
* Direct Messaging
* Profile Photos
* Mutual Friends
* JWT-Based Authentication
* Redis Caching
* Docker Deployment
* Microservices Migration

---

## Why This Project Matters

Social networking platforms operate at massive scale and require efficient handling of user relationships, authentication, data consistency, and API performance.

LetsConnect serves as a practical implementation of these backend engineering concepts while showcasing the ability to design and build scalable, production-oriented systems using Java and Spring Boot.

---

## Project Goals

The primary objective of this project was to strengthen understanding of:

* Enterprise Java Development
* Spring Boot Framework
* Relational Database Modeling
* API Design Best Practices
* Scalable Backend Architecture
* Real-World Software Engineering Principles
