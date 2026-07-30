import officeImg from "./assets/office.jpg";

function App() {
  // List of Office Objects
  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: officeImg,
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Bangalore",
      Image: officeImg,
    },
    {
      Name: "Regus",
      Rent: 45000,
      Address: "Hyderabad",
      Image: officeImg,
    },
    {
      Name: "SmartWorks",
      Rent: 90000,
      Address: "Pune",
      Image: officeImg,
    },
  ];

  return (
    <div style={{ marginLeft: "100px" }}>
      {/* Heading */}
      <h1>Office Space , at Affordable Range</h1>

      {/* Loop through office list */}
      {officeList.map((item, index) => (
        <div key={index} style={{ marginBottom: "30px" }}>
          {/* Image */}
          <img
            src={item.Image}
            width="25%"
            height="25%"
            alt="Office Space"
          />

          {/* Details */}
          <h2>Name: {item.Name}</h2>

          <h3
            style={{
              color: item.Rent < 60000 ? "red" : "green",
            }}
          >
            Rent: Rs. {item.Rent}
          </h3>

          <h3>Address: {item.Address}</h3>
        </div>
      ))}
    </div>
  );
}

export default App;