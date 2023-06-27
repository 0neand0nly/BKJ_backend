
import './App.css';
import axios from "axios";
import {useState} from "react";

function App() {
    const [id,setid] = useState(1);
  function selecttestAxios() {
    axios.get('/select')
        .then(function (res) {
          console.log(res.data);  // getSelectList 버튼을 누르면 데이터들이
        });
  }
  function inserttestAxios(){
      axios.get('/insert')
          .then(function (res){
              console.log("insert OK"); // Insert 버튼을 누르면 "insert OK"
          });
    }




    return (
    <div className="App">
    <button onClick={() => selecttestAxios()}> getSelectList</button>
        <button onClick={() => inserttestAxios()}> Insert</button>
    </div>
  );
}



export default App;
