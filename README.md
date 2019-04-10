# FindBrew
# System name
- [FindBrew] 

# Description
- [Find your brew] 

# Entities
- [Beer]  
    - [id:Mandatory Number (0<ID<150)]
    - [name:Mandatory String (<30 char)]  
    - [description:Mandatory String (<150 char)]
    - [first_brewed:Mandatory Date]
    - [abv:Mandatory Integer(<4 char)] 
    - [Icon:Blob(<250 MB)] 
    - [volume:String(<4 char)] 
    - [tagline:String(<10 char)] 
    - [ingredients:String(<100 char)] 
    
# Api methods
        - [ Get beer by its id Method: Get /beer/{id}] 
        - [ Get beers list by abv Get /beer/abv/ ] 
        - [ Delete beer by its id delete /beer/{id} ] 
        - [ Edit beer by its id put /beer/{id} ] 
        - [ Create a beer  Post /beer/]  
# UI https://bit.ly/2P4lRoZ
- [ There will be two windows:main, second ]
    - [Main: A list of beers ]
     - [Possible actions:]
         -[ReadDescription: Read information about beer]
         -[SelectBeer: select favorite beer and add it to favorite beers list]
         -[CreateYourOwnBeer: create your own beer and add to beers list]
    - [Second: A list of favorite beers ]
     - [Possible actions:]
          - [Delete: delete beer from favorites list]
         
            
