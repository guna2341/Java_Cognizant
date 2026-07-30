import Post from "./Post";
import React from "react";

export class Posts extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            posts: [],
            loading: true,
            error: null
        };
    }

    loadPosts() {
            fetch("https://jsonplaceholder.typicode.com/posts")
                .then(response => response.json())
                .then(data => {
                    const posts = data.map(
                        p => new Post(p.id, p.title, p.body)
                    );
        
                    this.setState({ posts });
                }).catch(err => 
                this.setState({ 
                    posts: [],
                    loading: false,
                    error: "Error fetching posts"
                })).finally(() => 
                this.setState({
                    loading: false
                }));
    }

    componentDidMount() {
        this.loadPosts();
    }

    render() {
        const { posts, loading, error } = this.state;

        if (loading) {
            return <h2>Loading...</h2>;
        }

        if (error) {
            return <h2>Error: {error}</h2>;
        }

        return (
            <div>
                <h1>Posts</h1>

                {posts.map((post) => (
                    <div key={post.id}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                        <hr />
                    </div>
                ))}
            </div>
        );
    }

    componentDidCatch(error, info) {

    }
}