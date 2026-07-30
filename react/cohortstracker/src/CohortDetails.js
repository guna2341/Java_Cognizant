import React from "react";

function CohortDetails(props) {
  const { cohort } = props;

  if (!cohort) {
    return null;
  }

  return (
    <div>
      <h3>{cohort.cohortCode}</h3>
      <p>{cohort.technology}</p>
      <p>{cohort.status}</p>
      <p>{cohort.startDate}</p>
      <p>{cohort.endDate}</p>
      <p>{cohort.coach}</p>
    </div>
  );
}

export default CohortDetails