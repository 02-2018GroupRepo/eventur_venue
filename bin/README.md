# eventur_venue 

microservice project: eventur, venue division  


venue attributes:  
venueId (int via keygen), injected into each event as a foreign key  
venueName (string)  
address (string)  
capacity (int)  
transitInfo (string)  
availability (boolean)  
 -> measured daily, based on date of events tied to that location  

communicating with:  
events attributes:  
eventId: int via keygen  
eventName: String  
venueId: foreign key  
description: String  
date: Date  
timeDuration: String  
