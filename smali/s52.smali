.class public final synthetic Ls52;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Ls52;->w:I

    iput p2, p0, Ls52;->x:I

    iput-object p1, p0, Ls52;->y:Ljava/lang/Object;

    iput-object p3, p0, Ls52;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo81;Lum1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ls52;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls52;->y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ls52;->z:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Ls52;->x:I

    .line 12
    .line 13
    return-void
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

.method public synthetic constructor <init>(Lp33;ILk62;)V
    .locals 1

    .line 14
    const/4 v0, 0x2

    iput v0, p0, Ls52;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls52;->y:Ljava/lang/Object;

    iput p2, p0, Ls52;->x:I

    iput-object p3, p0, Ls52;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Ls52;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    iget v2, p0, Ls52;->x:I

    .line 6
    .line 7
    iget-object v3, p0, Ls52;->z:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Ls52;->y:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lo81;

    .line 15
    .line 16
    check-cast v3, Lum1;

    .line 17
    .line 18
    new-instance v0, Lbi1;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x3

    .line 22
    invoke-direct {v0, v3, v2, v4, v5}, Lbi1;-><init>(Ljava/lang/Object;ILf61;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v4, v4, v0, v5}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_0
    check-cast p0, Lp33;

    .line 30
    .line 31
    check-cast v3, Lk62;

    .line 32
    .line 33
    :try_start_0
    iget-object v0, p0, Lp33;->S:Lx33;

    .line 34
    .line 35
    invoke-virtual {v0, v2, v3}, Lx33;->B(ILk62;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    sget-object v2, Lk62;->z:Lk62;

    .line 41
    .line 42
    invoke-virtual {p0, v2, v2, v0}, Lp33;->a(Lk62;Lk62;Ljava/io/IOException;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-object v1

    .line 46
    :pswitch_1
    check-cast p0, Lvr2;

    .line 47
    .line 48
    check-cast v3, Lbd5;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Lbd5;->e(I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {p0, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :pswitch_2
    check-cast p0, Ljava/lang/String;

    .line 62
    .line 63
    check-cast v3, Lt52;

    .line 64
    .line 65
    new-array v0, v2, [Lll6;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    move v4, v1

    .line 69
    :goto_1
    if-ge v4, v2, :cond_0

    .line 70
    .line 71
    new-instance v5, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v6, 0x2e

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v6, v3, Lik5;->e:[Ljava/lang/String;

    .line 85
    .line 86
    aget-object v6, v6, v4

    .line 87
    .line 88
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    sget-object v6, Ln57;->o:Ln57;

    .line 96
    .line 97
    new-array v7, v1, [Lll6;

    .line 98
    .line 99
    invoke-static {v5, v6, v7}, Lb85;->g(Ljava/lang/String;Ln85;[Lll6;)Lnl6;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    aput-object v5, v0, v4

    .line 104
    .line 105
    add-int/lit8 v4, v4, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_0
    return-object v0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
