.class public final Ljq8;
.super Llq8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final e:Llq8;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ljq8;

    .line 2
    .line 3
    new-instance v1, Lzt6;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2}, Lzt6;-><init>(I)V

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v3, v1}, Llq8;-><init>(Llq8;Lzt6;)V

    .line 11
    .line 12
    .line 13
    iget-boolean v1, v0, Llq8;->c:Z

    .line 14
    .line 15
    const-string v3, "Already frozen"

    .line 16
    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, v0, Llq8;->c:Z

    .line 21
    .line 22
    sput-object v0, Ljq8;->e:Llq8;

    .line 23
    .line 24
    new-instance v4, Ljq8;

    .line 25
    .line 26
    new-instance v5, Lzt6;

    .line 27
    .line 28
    invoke-direct {v5, v2}, Lzt6;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v4, v0, v5}, Llq8;-><init>(Llq8;Lzt6;)V

    .line 32
    .line 33
    .line 34
    iget-boolean v0, v4, Llq8;->c:Z

    .line 35
    .line 36
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v4}, Llq8;->a()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    sget-object v0, Llq8;->d:Lor2;

    .line 47
    .line 48
    invoke-virtual {v5, v0, v2}, Lzt6;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-boolean v0, v4, Llq8;->c:Z

    .line 52
    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    iput-boolean v1, v4, Llq8;->c:Z

    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    const-string v0, "Key already present"

    .line 63
    .line 64
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_2
    const-string v0, "Can\'t mutate after handing to trace"

    .line 69
    .line 70
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    invoke-static {v3}, Lh;->s(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
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
