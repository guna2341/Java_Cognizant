function Scorebelow70(props) {

    const result = props.players.filter(player => player.score < 70);

    return (
        <ul>
            {
                result.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))
            }
        </ul>
    );
}

export default Scorebelow70;