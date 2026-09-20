.class public final synthetic Lnh1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx83;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lx83;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lnh1;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lnh1;->x:Lx83;

    .line 4
    .line 5
    iput-object p2, p0, Lnh1;->y:Ljava/lang/String;

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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lnh1;->w:I

    .line 2
    .line 3
    sget-object v1, Lvs7;->a:Lvs7;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v10, p1

    .line 12
    check-cast v10, Lyt2;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    and-int/lit8 p2, p1, 0x3

    .line 21
    .line 22
    if-eq p2, v3, :cond_0

    .line 23
    .line 24
    move v2, v4

    .line 25
    :cond_0
    and-int/2addr p1, v4

    .line 26
    invoke-virtual {v10, p1, v2}, Lyt2;->V(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const/4 v11, 0x0

    .line 33
    const/16 v12, 0xc

    .line 34
    .line 35
    iget-object v5, p0, Lnh1;->x:Lx83;

    .line 36
    .line 37
    iget-object v6, p0, Lnh1;->y:Ljava/lang/String;

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const-wide/16 v8, 0x0

    .line 41
    .line 42
    invoke-static/range {v5 .. v12}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v10}, Lyt2;->Y()V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-object v1

    .line 50
    :pswitch_0
    move-object v7, p1

    .line 51
    check-cast v7, Lyt2;

    .line 52
    .line 53
    check-cast p2, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    and-int/lit8 p2, p1, 0x3

    .line 60
    .line 61
    if-eq p2, v3, :cond_2

    .line 62
    .line 63
    move v2, v4

    .line 64
    :cond_2
    and-int/2addr p1, v4

    .line 65
    invoke-virtual {v7, p1, v2}, Lyt2;->V(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    const/16 v9, 0xc

    .line 73
    .line 74
    iget-object v2, p0, Lnh1;->x:Lx83;

    .line 75
    .line 76
    iget-object v3, p0, Lnh1;->y:Ljava/lang/String;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    const-wide/16 v5, 0x0

    .line 80
    .line 81
    invoke-static/range {v2 .. v9}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {v7}, Lyt2;->Y()V

    .line 86
    .line 87
    .line 88
    :goto_1
    return-object v1

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
