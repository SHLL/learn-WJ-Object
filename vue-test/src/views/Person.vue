<template>
    <div>
        <table>
            <tr>
                <td>用户id</td>
                <td>用户名</td>
                <td>性别</td>
                <td>联系方式</td>
            </tr>
            <tr v-for="item in Person" v-bind:key="item">
                <td>{{item.id}}</td>
                <td>{{item.name}}</td>
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
                Person:[
                    {
                        id:1,
                        name: '用户1',
                        sex: '男',
                        phone: 'XXX'
                    },
                    {
                        id:2,
                        name: '用户2',
                        sex: '女',
                        phone: 'xxx'
                    },
                    {
                        id:3,
                        name: '用户3',
                        sex: '男',
                        phone: 'xxx'
                    }
                ]
            }
        }
    }
</script>

<style scoped>

</style>