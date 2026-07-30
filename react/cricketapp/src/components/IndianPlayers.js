export function OddPlayers(players) {

    const [first, , third, , fifth] = players;

    return (
        <ul>
            <li>{first}</li>
            <li>{third}</li>
            <li>{fifth}</li>
        </ul>
    );
}

export function EvenPlayers(players) {

    const [, second, , fourth, , sixth] = players;

    return (
        <ul>
            <li>{second}</li>
            <li>{fourth}</li>
            <li>{sixth}</li>
        </ul>
    );
}

export function ListofIndianPlayers(props) {

    return (
        <ul>
            {
                props.IndianPlayers.map((player, index) => (
                    <li key={index}>{player}</li>
                ))
            }
        </ul>
    );
}