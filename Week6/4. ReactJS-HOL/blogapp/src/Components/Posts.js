import React from "react";
import Post from "../Post";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }
  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((res) => res.json())
      .then((data) => {
        const postObjects = data.map(
          (item) => new Post(item.id, item.title, item.body)
        );
        this.setState({ posts: postObjects });
      })
      .catch((error) => console.error(error));
  }
  componentDidMount() {
    this.loadPosts();
  }
  render() {
    return (
      <div style={{ padding: "20px" }}>
        <h1>Blog Posts</h1>
        {this.state.posts.length === 0 ? (
          <p>Loading...</p>
        ) : (
          this.state.posts.map((post) => (
            <div
              key={post.id}
              style={{
                border: "1px solid gray",
                margin: "10px 0",
                padding: "10px",
                backgroundColor: "#f9f9f9",
              }}
            >
              <h2>{post.title}</h2>
              <p>{post.body}</p>
            </div>
          ))
        )}
      </div>
    );
  }
  componentDidCatch(error, info) {
    console.error("Error occurred:" + error);
  }
}

export default Posts;
