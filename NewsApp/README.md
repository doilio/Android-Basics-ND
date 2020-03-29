## Project 6: News App
## Project Overview
 > The goal is to create a News Feed app which gives a user regularly-updated news from the Internet related to a particular topic, person, or location. The presentation of the information as well as the topic is up to you.
To achieve this, you will use the Guardian API. This is a well-maintained API which returns information in a JSON format.
We suggest first exploring the API and learning what information it returns given a particular query.
 ## Requirements
The required components for this project are:
* App contains a main screen which displays multiple news stories
* Each list item on the main screen displays relevant text and information about the story.
* The title of the article and the name of the section that it belongs to are required field.
* Stories shown on the main screen update properly whenever new news data is fetched from the API.
* Clicking on a story uses an intent to open the story in the user’s browser.
* App queries the content.guardianapis.com api to fetch news stories related to the topic chosen by the student, using either the ‘test’ api key or the student’s key.
* The app checks whether the device is connected to the internet and responds appropriately. The result of the request is validated to account for a bad server response or lack of server response.
* Networking operations are done using a Loader rather than an AsyncTask.
* The intent of this project is to give you practice writing raw Java code using the necessary classes provided by the Android framework; therefore, the use of external libraries for the core functionality will not be permitted to complete this project.


![device-2020-03-29-143634](https://user-images.githubusercontent.com/38020305/77850204-228d2380-71d1-11ea-8d21-f54bd2e51da4.png)
![device-2020-03-29-143404](https://user-images.githubusercontent.com/38020305/77850198-1d2fd900-71d1-11ea-8675-591568051055.png)
![device-2020-03-29-143531](https://user-images.githubusercontent.com/38020305/77850201-202ac980-71d1-11ea-9daa-1f411842660e.png)
