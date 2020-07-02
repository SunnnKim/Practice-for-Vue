// webpack.config.js
// `webpack` command will pick up this config setup by default
var path = require("path"); // node.js의 path 라이브러리를 가져옴

module.exports = {
  mode: "none",
  entry: "./src/index.js",  // 불러올 파일
  output: {
    filename: "main.js",    // 실행할 라이브러리가 있는 곳
    path: path.resolve(__dirname, "dist"),
    // node.js 의 path 라이브러리의 path.resolve : 경로를 잡아주는 API
  },
};
