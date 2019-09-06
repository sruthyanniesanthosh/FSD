hours = [
     {
         monday:null,
         tuesday:null,
         wednesday:null,
         thursday:null,
         friday:null

     },

     {
        monday: null,
        tuesday:null,
        wednesday:null,
        thursday:null,
        friday:null

    },

    {
        monday: null,
        tuesday:null,
        wednesday:null,
        thursday:null,
        friday:null

    },

    {
        monday: null,
        tuesday:null,
        wednesday:null,
        thursday:null,
        friday:null

    },

    {
        monday: null,
        tuesday:null,
        wednesday:null,
        thursday:null,
        friday:null

    },
]




hour =[
    {
        sub:null,
        teacher:null
    }
]
 saveDetails = (e) =>{
    
    
   
        
        sub= document.getElementById('sub').value,
        teacher=document.getElementById('teacher').value,
        console.log(sub);
        console.log(teacher);
    
    //hour.push(hourday); 
    //console.log(hour);
    var id1=i;
    console.log(id1);
     document.getElementById(id1).innerHTML = sub + teacher;
    //  document.getElementById('first').innerHTML = teacher;
    // add the user to user array
    //   showTable(); // reload user table
    
    console.log("Hello");
}
var i ;
const showTable = () =>{
    
    let rows = '';
    // create records
    hours.forEach(u =>{

        rows += 
        `<tr>
                    <td id='1'onclick=openForm(id);>${u.monday}
                        
                    
                    <div id ='x'></div>
                    </td>
                    
                    <td id='2' onclick=openForm(id)>${u.tuesday}
                    
                    </td>
                    <td id='3' onclick=openForm(id)>${u.wednesday}
                    
                    </td>
                    <td id='4' onclick=openForm(id)>${u.thursday}
                
                    </td>
                    <td id='5' onclick=openForm(id)>${u.friday}
                    
                    </td>
                  
                </tr>`;
    });

    let table = `<table border="3px">
                    <tr>
                        <th>Monday</th>
                        <th>Tuesday</th>
                        <th>Wednesday</th>
                        <th>Thursday</th>
                        <th>Friday</th>
                        
                    </tr>
                        ${rows}
                </table>`;
    
    document.getElementById('table').innerHTML = table; 
    
}

 openForm =(id) => {
     i=id;
     console.log(i);
    document.getElementById("myForm").style.display = "block";
    

    var list1 = document.getElementById("sub");
    var list2 = document.getElementById("teacher");


    var list1SelectedValue = list1.options[list1.selectedIndex].value;
             
    if (list1SelectedValue=='Physics')
    {
         
        list2.options.length=0;
        list2.options[0] = new Option('--Select--', '');
        list2.options[1] = new Option('Mohsin', 'Mohsin');
        list2.options[2] = new Option('Sruthy', 'Sruthy');
        
         
    }
    else if (list1SelectedValue=="Chemistry")
    {
         
        list2.options.length=0;
        list2.options[0] = new Option('--Select--', '');
        list2.options[1] = new Option('Achu', 'Achu');
        list2.options[2] = new Option('Vaish', 'Vaish');
        
         
    }

    else if (list1SelectedValue=='Maths')
    {
         
        list2.options.length=0;
        list2.options[0] = new Option('--Select--', '');
        list2.options[1] = new Option('Sheena', 'Sheena');
        list2.options[2] = new Option('Santhosh', 'Santhosh');
        
         
    }
    saveDetails();
  }
  
closeForm = () => {
    console.log("CLOSE");
    document.getElementById("myForm").style.display = "none";
    document.getElementById("table").style.display = "block";
    showTable();
  }


  getDetails = (uid) =>{
   
}

