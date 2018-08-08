<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>Essential Second</h2>
    <router-link :to="{name:'first'}">go First</router-link>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Second'
    }
  },
  created () {
    var that = this
    that.$http({
      method: 'GET',
      url: 'http://localhost:8080//article/get/1'
    }).then((data) => {
      this.$set('msg', data.body.desc)
      console.log('data.body.desc : ' + data.body.desc)
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
