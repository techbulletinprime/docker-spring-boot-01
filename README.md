

# How to containerize Spring Boot Application with Docker

>@SpringBootApplication

---

## Table of Contents (Optional)

> If your `README` has a lot of info, section headers might be nice.

- [Installation](#installation)
- [Features](#features)
- [Contributing](#contributing)
- [FAQ](#faq)
- [Support](#support)
- [License](#license)


---

## Example (Optional)

```javascript
// code away!

@SpringBootApplication
public class DockerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}

}
```

---

## Installation

- Just Clone this repo
- Run mvn clean install
- Run this command from project Root folder. : docker build -t spring-app:v1 .
- Then Run the container using the command: docker run -p 9090:3030 spring-app:v1
- Access the application hitting the url from browser : http://localhost:9090/employee
### Clone

- Clone this repo to your local machine using `https://github.com/techbulletinprime/docker-spring-boot-01.git`

### Setup

---

## Features
---
- Spring Doc at <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/cache/annotation/EnableCaching.html" target="_blank">`Spring Doc`</a>
- Docker Official Doc :  <a href="https://docs.docker.com/reference/" target="_blank">`Docker Official Page`</a>

## Usage
- NA
## Documentation
- NA
## Tests 
- NA
---

## Contributing

> To get started...

### Step 1

- **Option 1**
    - 🍴 Fork this repo!

- **Option 2**
    - 👯 Clone this repo to your local machine using `https://github.com/techbulletinprime/spring-boot-cache-jdk`

### Step 2

- **HACK AWAY!** 🔨🔨🔨

### Step 3

- 🔃 Create a new pull request.

---
---

## FAQ

- **How do I do *specifically* so and so?**
    - No problem !feel free to reachout to me.

---

## Support

Reach out to me at one of the following places!

- Facebook at <a href="https://www.facebook.com/rajanikanta.pradhan1" target="_blank">`Rajanikanta`</a>
- Youtube at <a href="https://www.youtube.com/c/javashastra" target="_blank">`@Java Shastra`</a>


---


## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
