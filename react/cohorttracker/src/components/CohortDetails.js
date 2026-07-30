import "./CohortDetails.css";

const cohorts = [
    {
        id: 1,
        cohortCode: "INTADMDF10 -.NET FSD",
        startDate: "22-Feb-2022",
        currentStatus: "Scheduled",
        coach: "Aathma",
        trainer: "Jojo Jose"
    },
    {
        id: 2,
        cohortCode: "ADM21JF014 -Java FSD",
        startDate: "10-Sep-2021",
        currentStatus: "Ongoing",
        coach: "Apoorv",
        trainer: "Elisa Smith"
    },
    {
        id: 3,
        cohortCode: "CDBJF21025 -Java FSD",
        startDate: "24-Dec-2021",
        currentStatus: "Ongoing",
        coach: "Aathma",
        trainer: "John Doe"
    }
];

function CohortDetails() {
    return (
        <div className="wrapper">
            <h1 className="heading">Cohorts Details</h1>

            <div className="row">
                {cohorts.map((cohort) => (
                    <div key={cohort.id} className="box">
                        <h3
                            className={
                                cohort.currentStatus === "Ongoing"
                                    ? "green"
                                    : "blue"
                            }
                        >
                            {cohort.cohortCode}
                        </h3>

                        <dl className="dl">
                            <dt>Started On</dt>
                            <dd>{cohort.startDate}</dd>

                            <dt>Current Status</dt>
                            <dd>{cohort.currentStatus}</dd>

                            <dt>Coach</dt>
                            <dd>{cohort.coach}</dd>

                            <dt>Trainer</dt>
                            <dd>{cohort.trainer}</dd>
                        </dl>
                    </div>
                ))}
            </div>
        </div>
    );
}

export default CohortDetails;