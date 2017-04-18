# Falling Up
### An Interactive Exploration into Alzheimer's Disease
##### A Project By: Christian Hughes, Dylan George, & Katie Kristiansen

_Falling Up_ is an interactive story game designed to raise awareness and empathy for sufferers of Alzheimer's Disease.

_Falling Up_ was originally developed by the [KSU Anthropology Department](https://www.k-state.edu/sasw/anth/). We have improved upon the original version, and added support for many different platforms.

### Download Links

|                         Windows PC                         |                             Mac                            |                      Google Cardboard                      |                         Oculus Rift                        |
|:----------------------------------------------------------:|:----------------------------------------------------------:|:----------------------------------------------------------:|:----------------------------------------------------------:|
| [Version 0.5](https://www.youtube.com/watch?v=dQw4w9WgXcQ) | [Version 0.5](https://www.youtube.com/watch?v=dQw4w9WgXcQ) | [Version 0.5](https://www.youtube.com/watch?v=dQw4w9WgXcQ) | [Version 0.5](https://www.youtube.com/watch?v=dQw4w9WgXcQ) |

## Game Summary
_Falling Up_ tells the story of an elderly man (Floyd) living in the [Meadowlark Hills Retirement Community](http://www.meadowlark.org). For years, he has lived with Alzheimer's disease. He relies on the instructions of his wife to perform even the most basic of tasks, and has forgotten much of his past. The player takes the role of this man (Floyd) as he explores Meadowlark Hills, and rediscovers forgotten memories.

### Game Trailer
![Falling Up Trailer](http://i.imgur.com/7dVxzRE.png)

### Screenshots
![Start Screen Screenshot](http://i.imgur.com/L7FRiQd.png)
![Apartment Screenshot](http://i.imgur.com/J77QWGn.png)

## Player Instructions
Traverse the halls of Meadowlark Hills in search of forgotten memories. Interact with objects in the environment to reveal details of your past.


### Controls by Platform
|                          |                Windows/Mac/Oculus Rift               |                Google Cardboard                |
|:------------------------:|:----------------------------------------------------:|:----------------------------------------------:|
| **Player Movement**      |         WASD on keyboard or left analog stick        | Hold button while looking in desired direction |
| **Player View**          | Mouse movement, right analog stick, or HMD movement  |                  HMD movement                  |
| **Interact with Object** |                     E or A button                    |       Push button while looking at object      |
| **Pause**                |                Escape or Start button                |                       N/A                      |

## Developer Documentation


### 1.0 Getting Started

_Falling Up_ is built in the [Unreal Engine](https://www.unrealengine.com/what-is-unreal-engine-4). Development requires version 4.14.3 or above, which can be downloaded [here](https://www.unrealengine.com/download).

To get started, clone this repository and launch the project via the ```FallingUpVR.uproject``` file. If using version control, using [GitHub Desktop](https://desktop.github.com) is highly recommended.

### 2.0 File & Asset Layout

All the files you will be working with are located in _FallingUp/Content/_
Inside you will find different folders meant to help organize the different objects used throughout the game. These folders are:
* Architecture - objects such as doors, windows and pillars
* Audio - wav audio clips that play for some of the memory objects
* Blueprints - memory objects and player movement blueprints
* Fonts - text files used for the start screen
* Furniture - objects such as couches, chairs, and tables
* Images - JPG and PNG files that are used as textures/materials for different materials or objects
* Maps - the two levels in the game (_GroundFloor.umap_ and _Apartment.umap_)
* Materials - files that are used to add a color or image to different objects
* Movies - mp4 files that play during some of the memory objects
* Objects - objects that are not normally considered furniture such as books, paper, cards, and bowls
* Resources - files used to create the grass outside
* Textures - files used along side materials to add different color effects to objects
* Widgets - files used for the start menu and the video player

### 3.0 Gameplay Alterations

#### 3.1 Adjusting Player Movement

The input buttons and turn rate can be modified in the Project Settings under Input. 

Movement input is handled in the Player blueprint, and the max or min speed can be modified in the movement component in the Player blueprint. The blueprint code provided is generic, and it is recommended to create a seperate blueprint altogether if you want to refine the camera and controller input, especially for VR.

#### 3.2 Adjusting Door Interactions

Door behavior is currently defined in the B_Door blueprint. There, the controls to interact with doors can be modified and bugs involving doors can be fixed. The blueprint has a built in animation to rotate the doors which is currently buggy.

#### 3.3 How to Add Memories

To add a new memory, create a new blueprint asset that inherits from the MemoryObject blueprint. Add a mesh component to the object set it as the desired model. In the constructor, set the Audio, Video, and Material variables to the desired assets for the memory. 

#### 3.4 Modifying Object Interaction Routines

Interactions with memory objects is handled in two sections of the Player blueprint. Memories that are created properly will automatically utilize this part of the blueprint. One section handles playing video, and the other handles audio. Depending on whether the version being worked on is in VR, the method that videos are displayed on the screen should be different and that can be modified here. The audio section should not need to be modified.

### 4.0 Building _Falling Up_ For Different Platforms

Falling Up is capable of being built on several platforms, choosable at the time of packaging. However, the different versions will have varying settings, so a repo that allows for multiplatform differences needs to be set up.

## Testing Procedures
A comprehensive testing plan is included as:
```/Falling_Up_Test_Plan.pdf```

An editable version of the [Testing Document](https://docs.google.com/document/d/1JRRk8aNslYpcutnF0-EPZ1ZKUrV0vxHIQb4KtBZh7zw/edit) is available online via Google Docs.
