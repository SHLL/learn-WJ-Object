<template>
    <div>
        <table>
            <tr>
                <td>用户id</td>
                <td>用户名</td>
                <td>性别</td>
                <td>联系方式</td>
            </tr>
            <tr v-for='(item,index) in Person' v-bind:key="index">
                <td>{{item.id}}</td>
                <td>{{item.username}}</td>
                <td>{{item.sex}}</td>
                <td>{{item.phone}}</td>
            </tr>
        </table>
    </div>
</template>

<script>
    export default {
        name: "Person",
        data(){
            return{
                msg: 'Hello Vue',
                Person:[]
            }
        },
        created() {
            const _this = this
            this.$axios.get('persons/findAll')
            .then(function (resp) {
                _this.Person = resp.data
                console.log(resp)
            })
        }
    }
</script>

<style scoped>

</style>