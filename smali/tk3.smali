.class public final synthetic Ltk3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(IJLjava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Ltk3;->w:I

    .line 2
    .line 3
    iput-wide p2, p0, Ltk3;->x:J

    .line 4
    .line 5
    iput-object p4, p0, Ltk3;->y:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ltk3;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, Ltk3;->y:Ljava/lang/String;

    .line 8
    .line 9
    iget-wide v5, p0, Ltk3;->x:J

    .line 10
    .line 11
    check-cast p1, Lua6;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-string p0, "UPDATE workspec SET last_enqueue_time=? WHERE id=?"

    .line 20
    .line 21
    invoke-interface {p1, p0}, Lua6;->k0(Ljava/lang/String;)Lab6;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :try_start_0
    invoke-interface {p0, v5, v6, v3}, Lab6;->f(JI)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, v2, v4}, Lab6;->F(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Lab6;->i0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const-string p0, "UPDATE workspec SET schedule_requested_at=? WHERE id=?"

    .line 47
    .line 48
    invoke-interface {p1, p0}, Lua6;->k0(Ljava/lang/String;)Lab6;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :try_start_1
    invoke-interface {p0, v5, v6, v3}, Lab6;->f(JI)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0, v2, v4}, Lab6;->F(ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p0}, Lab6;->i0()Z

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lo55;->k(Lua6;)I

    .line 62
    .line 63
    .line 64
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    const-string p0, "UPDATE nauta_accounts SET lastUsed = ? WHERE email = ?"

    .line 82
    .line 83
    invoke-interface {p1, p0}, Lua6;->k0(Ljava/lang/String;)Lab6;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    :try_start_2
    invoke-interface {p0, v5, v6, v3}, Lab6;->f(JI)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p0, v2, v4}, Lab6;->F(ILjava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p0}, Lab6;->i0()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 94
    .line 95
    .line 96
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 97
    .line 98
    .line 99
    return-object v1

    .line 100
    :catchall_2
    move-exception p1

    .line 101
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 102
    .line 103
    .line 104
    throw p1

    .line 105
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const-string p0, "UPDATE jetpacks SET needsSync = 0, syncAction = \'NONE\', lastSynced = ? WHERE id = ?"

    .line 109
    .line 110
    invoke-interface {p1, p0}, Lua6;->k0(Ljava/lang/String;)Lab6;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    :try_start_3
    invoke-interface {p0, v5, v6, v3}, Lab6;->f(JI)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p0, v2, v4}, Lab6;->F(ILjava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p0}, Lab6;->i0()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 121
    .line 122
    .line 123
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 124
    .line 125
    .line 126
    return-object v1

    .line 127
    :catchall_3
    move-exception p1

    .line 128
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
