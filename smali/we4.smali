.class public final Lwe4;
.super Lye4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/Iterator;
.implements Lar3;


# instance fields
.field public final synthetic A:I


# direct methods
.method public constructor <init>(Lze4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwe4;->A:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lye4;->z:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p2, -0x1

    .line 12
    iput p2, p0, Lye4;->x:I

    .line 13
    .line 14
    iget p1, p1, Lze4;->D:I

    .line 15
    .line 16
    iput p1, p0, Lye4;->y:I

    .line 17
    .line 18
    invoke-virtual {p0}, Lye4;->f()V

    .line 19
    .line 20
    .line 21
    return-void
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
.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwe4;->A:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lye4;->b()V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lye4;->w:I

    .line 11
    .line 12
    iget-object v2, p0, Lye4;->z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lze4;

    .line 15
    .line 16
    iget v3, v2, Lze4;->B:I

    .line 17
    .line 18
    if-ge v0, v3, :cond_0

    .line 19
    .line 20
    add-int/lit8 v1, v0, 0x1

    .line 21
    .line 22
    iput v1, p0, Lye4;->w:I

    .line 23
    .line 24
    iput v0, p0, Lye4;->x:I

    .line 25
    .line 26
    iget-object v0, v2, Lze4;->x:[Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lye4;->x:I

    .line 32
    .line 33
    aget-object v1, v0, v1

    .line 34
    .line 35
    invoke-virtual {p0}, Lye4;->f()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {}, Lrf2;->c()V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-object v1

    .line 43
    :pswitch_0
    invoke-virtual {p0}, Lye4;->b()V

    .line 44
    .line 45
    .line 46
    iget v0, p0, Lye4;->w:I

    .line 47
    .line 48
    iget-object v2, p0, Lye4;->z:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lze4;

    .line 51
    .line 52
    iget v3, v2, Lze4;->B:I

    .line 53
    .line 54
    if-ge v0, v3, :cond_1

    .line 55
    .line 56
    add-int/lit8 v1, v0, 0x1

    .line 57
    .line 58
    iput v1, p0, Lye4;->w:I

    .line 59
    .line 60
    iput v0, p0, Lye4;->x:I

    .line 61
    .line 62
    iget-object v1, v2, Lze4;->w:[Ljava/lang/Object;

    .line 63
    .line 64
    aget-object v1, v1, v0

    .line 65
    .line 66
    invoke-virtual {p0}, Lye4;->f()V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-static {}, Lrf2;->c()V

    .line 71
    .line 72
    .line 73
    :goto_1
    return-object v1

    .line 74
    :pswitch_1
    invoke-virtual {p0}, Lye4;->b()V

    .line 75
    .line 76
    .line 77
    iget v0, p0, Lye4;->w:I

    .line 78
    .line 79
    iget-object v2, p0, Lye4;->z:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Lze4;

    .line 82
    .line 83
    iget v3, v2, Lze4;->B:I

    .line 84
    .line 85
    if-ge v0, v3, :cond_2

    .line 86
    .line 87
    add-int/lit8 v1, v0, 0x1

    .line 88
    .line 89
    iput v1, p0, Lye4;->w:I

    .line 90
    .line 91
    iput v0, p0, Lye4;->x:I

    .line 92
    .line 93
    new-instance v1, Lxe4;

    .line 94
    .line 95
    invoke-direct {v1, v2, v0}, Lxe4;-><init>(Lze4;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lye4;->f()V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    invoke-static {}, Lrf2;->c()V

    .line 103
    .line 104
    .line 105
    :goto_2
    return-object v1

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
