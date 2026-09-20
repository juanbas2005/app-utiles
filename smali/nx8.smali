.class public final synthetic Lnx8;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lfs8;
.implements Lvl8;


# static fields
.field public static final synthetic x:Lnx8;

.field public static final synthetic y:Lnx8;

.field public static final synthetic z:Lnx8;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lnx8;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lnx8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lnx8;->x:Lnx8;

    .line 8
    .line 9
    new-instance v0, Lnx8;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lnx8;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lnx8;->y:Lnx8;

    .line 16
    .line 17
    new-instance v0, Lnx8;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lnx8;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lnx8;->z:Lnx8;

    .line 24
    .line 25
    return-void
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
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lnx8;->w:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lnx8;->w:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lgp8;->x:Lgp8;

    .line 7
    .line 8
    iget-object p0, p0, Lgp8;->w:La87;

    .line 9
    .line 10
    iget-object p0, p0, La87;->w:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lhp8;

    .line 13
    .line 14
    sget-object p0, Lhp8;->a:Lg79;

    .line 15
    .line 16
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    new-instance v0, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Ljava/lang/Boolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_0
    sget-object p0, Lby8;->a:Ljava/util/List;

    .line 33
    .line 34
    sget-object p0, Lap8;->x:Lap8;

    .line 35
    .line 36
    iget-object p0, p0, Lap8;->w:La87;

    .line 37
    .line 38
    iget-object p0, p0, La87;->w:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lbp8;

    .line 41
    .line 42
    sget-object p0, Lbp8;->b:Lg79;

    .line 43
    .line 44
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/lang/Boolean;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_1
    sget-object p0, Lby8;->a:Ljava/util/List;

    .line 52
    .line 53
    sget-object p0, Lip8;->x:Lip8;

    .line 54
    .line 55
    iget-object p0, p0, Lip8;->w:La87;

    .line 56
    .line 57
    iget-object p0, p0, La87;->w:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Ljp8;

    .line 60
    .line 61
    sget-object p0, Ljp8;->a:Lg79;

    .line 62
    .line 63
    invoke-virtual {p0}, Lt79;->get()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Ljava/lang/Boolean;

    .line 68
    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
