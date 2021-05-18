# Programming Mobile Applications Course. Spring 2021

## Laboratory work No. 3 - Application API layer

Laboratory work No.3 at Mobile Application Programming consist in implementing API layer of your app.
Implementation of API layer in your app represents integration of your app with some specific REST API or TCP server, fetching of real data and populating of UI with data received from network.

### Laboratory work task:

1. Pick an API it could be public or private in case you have access to it. You could use your own API or TCP server (in case you a building chat). In case if you use Firebase or another serverless service, please add integration to Firebase but also implement connection to another API by performing standard HTTP requests.
2. Implement at least 2 GET and 2 POST requests. At least 1 of your request should send data to API by request body in JSON format, but not by URL queries.
3. On Android you have to use Retrofit(https://square.github.io/retrofit/) and kotlin coroutines on iOS you have to use Alamofire(https://github.com/Alamofire/Alamofire) and RxSwift(https://github.com/ReactiveX/RxSwift) 
4. Add 2 more screens with implemented design, your app should have at least 5 screen, not just layout, but with implemented design.
5. Add basic navigation component for in app navigation drawer menu(swipeable menu from left to right), or tab bar navigation(bottom bar with tabs) 


![screenshot](1.png)
![screenshot](2.png)
![screenshot](3.png)
![screenshot](4.jpg)

## Laboratory work No.4 - Basic layout and UI
Laboratory work No.4 at Mobile Application Programming consist in analyzing different presentation layer architectures (ex. MVC, MVP, MVVM and others) and selecting one for implementing it in your project.

### Laboratory work task:
1. Perform a research on several mobile app architectures, they are almost the same for both platforms. Most popular architecture are MVC, MVP, MVVM, RIBs https://github.com/uber/RIBs , VIPER mostly for iOS, Hexagonal architecture https://en.wikipedia.org/wiki/Hexagonal_architecture_(software) 
2. Pick up an architecture which fits the best your project and refactor your code base to selected architecture. Your codebase should be refactored to follow idiomatic representation of selected architecture. You should follow principles of "Clean Architectures" https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html and "Clean code" https://www.investigatii.md/uploads/resurse/Clean_Code.pdf and please refactor your code to look clean and structured.

Please pay attention: Architecture is not about physical structure of your project, location of files and folders. Architecture is about dependencies and decoupling between your classes (objects) and layers of your app.
