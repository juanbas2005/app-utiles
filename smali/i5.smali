.class public final Li5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljw1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 13
    iput p4, p0, Li5;->a:I

    iput-object p1, p0, Li5;->b:Ljava/lang/Object;

    iput-object p2, p0, Li5;->c:Ljava/lang/Object;

    iput-object p3, p0, Li5;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lt54;Lq54;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Li5;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Li5;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Li5;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Li5;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    iget v0, p0, Li5;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Li5;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Li5;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Li5;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lpe6;

    .line 13
    .line 14
    iget-object v0, p0, Lpe6;->x:Ltp4;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ltp4;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v1, Lue6;

    .line 21
    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lpe6;->w:Ljava/util/Map;

    .line 25
    .line 26
    invoke-virtual {v1}, Lue6;->d()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {p0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p0, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void

    .line 44
    :pswitch_0
    check-cast v2, Lt54;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-interface {v2}, Lt54;->k()Lin8;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    check-cast p0, Lh5;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Lin8;->M0(Ls54;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    check-cast v1, Lcx0;

    .line 60
    .line 61
    sget-object p0, Lj54;->ON_DESTROY:Lj54;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lj54;->a()Lk54;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iput-object p0, v1, Lcx0;->x:Lk54;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcx0;->a()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_1
    check-cast v2, Lt54;

    .line 77
    .line 78
    invoke-interface {v2}, Lt54;->k()Lin8;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast p0, Lo54;

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Lin8;->M0(Ls54;)V

    .line 85
    .line 86
    .line 87
    check-cast v1, Lh06;

    .line 88
    .line 89
    iget-object p0, v1, Lh06;->w:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, Ll30;

    .line 92
    .line 93
    if-eqz p0, :cond_3

    .line 94
    .line 95
    invoke-virtual {p0}, Ll30;->a()V

    .line 96
    .line 97
    .line 98
    :cond_3
    return-void

    .line 99
    :pswitch_2
    check-cast p0, Lvu1;

    .line 100
    .line 101
    check-cast v2, Lzs4;

    .line 102
    .line 103
    invoke-virtual {p0}, Lnx4;->b()Lft4;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0, v2}, Lft4;->c(Lzs4;)V

    .line 108
    .line 109
    .line 110
    check-cast v1, Lyx6;

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_3
    check-cast p0, Lyx6;

    .line 117
    .line 118
    invoke-virtual {p0, v2}, Lyx6;->remove(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    check-cast v1, Lmk;

    .line 122
    .line 123
    iget-object p0, v1, Lmk;->d:Ltp4;

    .line 124
    .line 125
    invoke-virtual {p0, v2}, Ltp4;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_4
    check-cast p0, Lsr2;

    .line 130
    .line 131
    invoke-interface {p0}, Lsr2;->b()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    check-cast v2, Lt54;

    .line 135
    .line 136
    invoke-interface {v2}, Lt54;->k()Lin8;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast v1, Lh5;

    .line 141
    .line 142
    invoke-virtual {p0, v1}, Lin8;->M0(Ls54;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
