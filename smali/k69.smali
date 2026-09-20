.class public final synthetic Lk69;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lr69;


# direct methods
.method public synthetic constructor <init>(Lr69;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk69;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lk69;->x:Lr69;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
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
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lk69;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lk69;->x:Lr69;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ly19;

    .line 12
    .line 13
    iget-object v2, p0, Lr69;->z:Liy8;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object p0, v0, Ly19;->B:Lpz8;

    .line 18
    .line 19
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lpz8;->B:Lmz8;

    .line 23
    .line 24
    const-string v0, "Failed to send storage consent settings to service"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :try_start_0
    invoke-virtual {p0, v1}, Lr69;->s1(Z)Lz99;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v2, v1}, Liy8;->l(Lz99;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lr69;->p1()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception p0

    .line 42
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 43
    .line 44
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 48
    .line 49
    const-string v1, "Failed to send storage consent settings to the service"

    .line 50
    .line 51
    invoke-virtual {v0, v1, p0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :pswitch_0
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Ly19;

    .line 58
    .line 59
    iget-object v2, p0, Lr69;->z:Liy8;

    .line 60
    .line 61
    if-nez v2, :cond_1

    .line 62
    .line 63
    iget-object p0, v0, Ly19;->B:Lpz8;

    .line 64
    .line 65
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lpz8;->B:Lmz8;

    .line 69
    .line 70
    const-string v0, "Failed to send Dma consent settings to service"

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    :try_start_1
    invoke-virtual {p0, v1}, Lr69;->s1(Z)Lz99;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v2, v1}, Liy8;->D(Lz99;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lr69;->p1()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catch_1
    move-exception p0

    .line 88
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 89
    .line 90
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 94
    .line 95
    const-string v1, "Failed to send Dma consent settings to the service"

    .line 96
    .line 97
    invoke-virtual {v0, v1, p0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-void

    .line 101
    :pswitch_1
    invoke-virtual {p0}, Lr69;->i1()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
